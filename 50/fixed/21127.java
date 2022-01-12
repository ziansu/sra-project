public static anuragdesai.library.kneereplacement.Joint getJointFromButtonNumber(int number) {
    switch (number) {
        case 1 :
            return anuragdesai.library.kneereplacement.Joint.BACK;
        case 2 :
            return anuragdesai.library.kneereplacement.Joint.RIGHT_HIP;
        case 3 :
            return anuragdesai.library.kneereplacement.Joint.LEFT_HIP;
        case 4 :
            return anuragdesai.library.kneereplacement.Joint.RIGHT_KNEE;
        case 5 :
            return anuragdesai.library.kneereplacement.Joint.LEFT_KNEE;
    }
    return null;
}