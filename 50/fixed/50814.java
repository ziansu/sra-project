public static boolean userStillLoggedIn(long userExpireDate) {
    return (userExpireDate != 0) && (userExpireDate >= (java.lang.Math.round(((new java.util.Date().getTime()) / 1000.0))));
}