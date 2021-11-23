@java.lang.Override
public int compareTo(final uk.co.onsdigital.discovery.metadata.api.dto.common.DimensionOption that) {
    return com.google.common.collect.ComparisonChain.start().compare(this.levelType, that.levelType, uk.co.onsdigital.discovery.metadata.api.dto.common.DimensionOption.LevelTypeComparator.INSTANCE).compare(this.code, that.code, com.google.common.collect.Ordering.from(java.lang.String.CASE_INSENSITIVE_ORDER).nullsLast()).compare(this.name, that.name, com.google.common.collect.Ordering.from(java.lang.String.CASE_INSENSITIVE_ORDER).nullsLast()).result();
}