public void SetSetpoint(double units) {
    switch (mEnabledPIDMode) {
        case kManual :
            break;
        case kLinear :
            mLeftMotor1.set((units * (mInchesToEncoderUnits)));
            break;
        case kRotational :
            mLeftMotor1.set((units * (mRadiansToEncoderUnits)));
            break;
        case kAiming :
            mLeftMotor1.set(units);
            break;
    }
}