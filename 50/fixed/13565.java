public void regNoCheckDone(android.os.Bundle data) {
    if (data.getBoolean("exists")) {
        mRegNo.setError("This Registration Number is already Registered.");
        mRegNo.requestFocus();
    }
}