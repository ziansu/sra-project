@java.lang.Override
public java.lang.String serialize(final boolean includingBuiltIn) {
    return msi.gama.common.util.StringUtils.toGaml(data.getContent(), includingBuiltIn);
}