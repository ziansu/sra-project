protected void setupStates() {
    this.setDefaultState(getExtendedBlockState().withProperty(unlistedStringProp, values.get(0)).withProperty(stringProp, values.get(0)));
}