public boolean dockerInit(java.lang.String localpath, java.lang.String dockerpath, java.lang.String name, java.lang.String img) {
    if ((configuration.Docker.isDockerHere()) && (configuration.Docker.isDockerNameWellWritten(name))) {
        boolean b = configuration.Docker.launchDockerImage(properties, localpath, dockerpath, name, img);
        if (!b) {
            setStatus(program.RunProgram.status_BadRequirements, "Not able to initiate the docker container");
            return false;
        }
    }
    return true;
}