public hu.nik.project.environment.ScenePoint getSonarPos() {
    if ((startAngle) < 180) {
        sonarPosition = new hu.nik.project.environment.ScenePoint(((currPosition.getX()) + ((carWidth) / 2)), currPosition.getY());
        return sonarPosition;
    }else {
        sonarPosition = new hu.nik.project.environment.ScenePoint(((currPosition.getX()) + ((carWidth) / 2)), ((currPosition.getY()) + (carHeight)));
        return sonarPosition;
    }
}