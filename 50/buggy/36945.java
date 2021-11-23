public org.opendaylight.yangtools.yang.binding.DataObject dataObjectFromNormalizedNode(org.opendaylight.yangtools.yang.data.api.schema.NormalizedNode<?, ?> nn) {
    return codecRegistry.fromNormalizedNode(org.opendaylight.ttp.utils.TTPUtils.TOP_ODL_TTPS_PATH, nn).getValue();
}