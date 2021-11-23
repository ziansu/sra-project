public static de.fruitfly.ovr.enums.EyeType fromInteger(int x) {
    switch (x) {
        case -1 :
            return de.fruitfly.ovr.enums.EyeType.ovrEye_Center;
        case 0 :
            return de.fruitfly.ovr.enums.EyeType.ovrEye_Left;
        case 1 :
            return de.fruitfly.ovr.enums.EyeType.ovrEye_Right;
    }
    return de.fruitfly.ovr.enums.EyeType.ovrEye_Count;
}