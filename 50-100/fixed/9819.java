public it.blogspot.geoframe.SewerPipeDimensioning.Pipe run(final it.blogspot.geoframe.SewerPipeDimensioning.Pipe pipe) {
    setPipe(pipe);
    if ((pipeSlope) >= (minSlope)) {
        this.pipe.buildPipe(elevationEndPoint, computeDiameter(pipeSlope), it.blogspot.geoframe.SewerPipeDimensioning.SewerPipeDimensioning.fillCoefficient, computeVelocity());
    }else {
        this.pipe.buildPipe(computeElevationEndPoint(minSlope), diameter, it.blogspot.geoframe.SewerPipeDimensioning.SewerPipeDimensioning.fillCoefficient, computeVelocity());
    }
    return this.pipe;
}