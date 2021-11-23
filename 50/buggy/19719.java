public static au.id.ajlane.concurrent.Retry none() {
    return ( attempts, cause) -> -1;
}