public static <T> boolean batchEquals(T target, T... status) {
    for (T statu : status) {
        if (statu.equals(target)) {
            return true;
        }
    }
    return false;
}