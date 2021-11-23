public static boolean checkInUse(java.lang.String motor) {
    if (lenzhoundmusher.MotorController.motorsInUse.contains(motor))
        return true;
    else
        return false;
    
}