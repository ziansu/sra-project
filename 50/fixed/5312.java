@org.springframework.context.annotation.Bean
public com.github.dbadia.sqrl.server.SqrlServerOperations sqrlServerOperations() {
    return new com.github.dbadia.sqrl.server.SqrlServerOperations(sqrlConfig());
}