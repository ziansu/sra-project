public static boolean isMessageFromMe(@android.support.annotation.NonNull
com.nethergrim.vk.models.Message message) {
    int out = message.getOut();
    return out > 0;
}