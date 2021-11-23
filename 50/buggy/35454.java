public io.pity.api.environment.EnvironmentDataBuilder addData(java.lang.String name, java.lang.Object data) {
    environmentData.getEnvironmentResults().put(name, data);
    return this;
}