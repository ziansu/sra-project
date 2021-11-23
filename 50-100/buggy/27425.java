private void funcCalculate() {
    if ((mCurrentOrder) != null) {
        switch (mCurrentOrder) {
            case Addition :
                flashNumber += inputNumber;
                break;
            case Subtraction :
                flashNumber -= inputNumber;
                break;
            case Multiplication :
                if ((inputNumber) != (honkot.java.foundation.training.calculator.MainService.DEFAULT)) {
                    flashNumber *= inputNumber;
                }
                break;
            case Division :
                flashNumber /= inputNumber;
                break;
        }
    }else {
        if (afterEquals()) {
        }else {
            flashNumber = inputNumber;
        }
    }
    inputNumber = honkot.java.foundation.training.calculator.MainService.DEFAULT;
    stopDotInputMpde();
}