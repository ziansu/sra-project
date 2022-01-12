public static Account SearchAccountNumber(int AccNum) {
    for (Account A : Account.ACS) {
        if ((A != null) && ((A.accountNumber) == AccNum)) {
            return A;
        }
    }
    return null;
}