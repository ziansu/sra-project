@java.lang.Override
public void execute(int statusCode, java.lang.String message) {
    org.apache.kafka.common.utils.Exit.exit(statusCode);
}