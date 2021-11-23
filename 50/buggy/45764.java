public static boolean isMessageFromMe(@android.support.annotation.NonNull
com.nethergrim.vk.models.Message message) {
    return (message.getOut()) == 1;
}