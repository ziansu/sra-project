@java.lang.Override
public java.util.List<android.telecom.PhoneAccount> getAllPhoneAccounts() {
    synchronized(mLock) {
        try {
            java.util.List<android.telecom.PhoneAccount> allPhoneAccounts = mPhoneAccountRegistrar.getAllPhoneAccounts();
            java.util.List<android.telecom.PhoneAccount> profilePhoneAccounts = new java.util.ArrayList(allPhoneAccounts.size());
            for (android.telecom.PhoneAccount phoneAccount : profilePhoneAccounts) {
                if (isVisibleToCaller(phoneAccount)) {
                    profilePhoneAccounts.add(phoneAccount);
                }
            }
            return profilePhoneAccounts;
        } catch (java.lang.Exception e) {
            com.android.server.telecom.Log.e(this, e, "getAllPhoneAccounts");
            throw e;
        }
    }
}