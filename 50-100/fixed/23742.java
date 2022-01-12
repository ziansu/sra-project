public com.company.data.RobotState.Direction readInitialDirection(java.io.InputStream stream) {
    java.util.Scanner in = new java.util.Scanner(stream);
    in.useDelimiter("\n");
    if (in.hasNext()) {
        switch (in.next().trim()) {
            case "N" :
                return com.company.data.RobotState.Direction.N;
            case "S" :
                return com.company.data.RobotState.Direction.S;
            case "E" :
                return com.company.data.RobotState.Direction.E;
            case "W" :
                return com.company.data.RobotState.Direction.W;
            default :
                return null;
        }
    }
    return null;
}