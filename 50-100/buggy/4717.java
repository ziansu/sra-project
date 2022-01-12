public void SetDeltaSetpoint(double units) {
    switch (mEnabledPIDMode) {
        case kManual :
            break;
        case kLinear :
            mLeftMotor1.set(((units * (mInchesToEncoderUnits)) + (mLeftMotor1.getEncPosition())));
            break;
        case kRotational :
            mLeftMotor1.set(((units * (mRadiansToEncoderUnits)) + (mLeftMotor1.getEncPosition())));
            break;
        case kAiming :
            mLeftMotor1.set((units + (mLeftMotor1.getEncPosition())));
            break;
    }
}