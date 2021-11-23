public static com.kieran.winnipegbusbackend.enums.CoverageTypes getEnum(java.lang.String coverageType) {
    if (coverageType != null) {
        if (coverageType.equals(com.kieran.winnipegbusbackend.enums.CoverageTypes.EXPRESS.typeName))
            return com.kieran.winnipegbusbackend.enums.CoverageTypes.EXPRESS;
        else
            if (coverageType.equals(com.kieran.winnipegbusbackend.enums.CoverageTypes.SUPER_EXPRESS.typeName))
                return com.kieran.winnipegbusbackend.enums.CoverageTypes.SUPER_EXPRESS;
            else
                if (coverageType.equals(com.kieran.winnipegbusbackend.enums.CoverageTypes.RAPID_TRANSIT.typeName))
                    return com.kieran.winnipegbusbackend.enums.CoverageTypes.RAPID_TRANSIT;
                else
                    return com.kieran.winnipegbusbackend.enums.CoverageTypes.REGULAR;
                
            
        
    }else {
        return com.kieran.winnipegbusbackend.enums.CoverageTypes.REGULAR;
    }
}