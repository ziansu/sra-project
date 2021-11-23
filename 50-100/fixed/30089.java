@java.lang.Override
public void afterPropertiesSet() {
    java.util.List<org.onetwo.boot.core.web.mvc.ExtRequestMappingHandlerMapping.RequestMappingCombiner> combiners = this.combiners;
    if (combiners == null) {
        combiners = com.google.common.collect.Lists.newArrayList();
    }
    if (!(combiners.isEmpty())) {
        combiners.sort(OrderComparator.INSTANCE);
    }
    this.combiners = com.google.common.collect.ImmutableList.copyOf(combiners);
    super.afterPropertiesSet();
}