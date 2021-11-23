private java.lang.String getProjectionString(com.github.goober.coordinatetransformation.positions.RT90Position.RT90Projection projection) {
    java.lang.String retVal = "";
    switch (projection) {
        case rt90_7_5_gon_v :
            retVal = "rt90_7.5_gon_v";
            break;
        case rt90_5_0_gon_v :
            retVal = "rt90_5.0_gon_v";
            break;
        case rt90_2_5_gon_v :
            retVal = "rt90_2.5_gon_v";
            break;
        case rt90_0_0_gon_v :
            retVal = "rt90_0.0_gon_v";
            break;
        case rt90_2_5_gon_o :
            retVal = "rt90_2.5_gon_o";
            break;
        case rt90_5_0_gon_o :
            retVal = "rt90_5.0_gon_o";
            break;
        default :
            retVal = "rt90_2.5_gon_v";
            break;
    }
    return retVal;
}