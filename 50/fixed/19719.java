public static au.id.ajlane.concurrent.Retry none() {
    return ( attempts, cause) -> attempts == 0 ? 0 : -1;
}