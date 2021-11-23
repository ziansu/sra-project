private void createSystem(java.lang.String systemImage) throws java.lang.Exception {
    java.lang.String containerName = createContainer(org.hobbit.benchmark.gerbil.NifSystemAdapter.NIF_SYSTEM_ADAPTER_DOCKER_IMAGE, Constants.CONTAINER_TYPE_SYSTEM, new java.lang.String[]{ (org.hobbit.benchmark.gerbil.NifSystemAdapter.NOT_MASTER_NODE_KEY) + "=true" , ((org.hobbit.core.Constants.SYSTEM_PARAMETERS_MODEL_KEY) + "=") + (java.lang.System.getenv().get(Constants.SYSTEM_PARAMETERS_MODEL_KEY)) });
    if (containerName != null) {
        systemContainer = containerName;
    }else {
        throw new java.lang.Exception("Couldn't create slave node. Aborting.");
    }
}