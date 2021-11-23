@org.springframework.context.annotation.Bean
public com.github.dbadia.sqrl.server.SqrlServerOperations sqrlServerOperations() {
    final com.github.dbadia.sqrl.server.SqrlServerOperations c = new com.github.dbadia.sqrl.server.SqrlServerOperations(sqrlConfig());
    return c;
}