void bindEnvVars() {
    bindRequiredStringEnvVar(Constants.ENV_VAR_MESSAGE_CRYPTO_PASSWORD);
    bindRequiredStringEnvVar(Constants.ENV_VAR_MESSAGE_CRYPTO_IV);
    bindRequiredStringEnvVar(Constants.ENV_VAR_TASK);
    bindRequiredStringEnvVar(Constants.ENV_VAR_STEP_ID);
    bindRequiredStringEnvVar(Constants.ENV_VAR_CFG);
    bindRequiredStringEnvVar(Constants.ENV_VAR_ACTION_OR_TRIGGER);
    bindRequiredStringEnvVar(Constants.ENV_VAR_AMQP_URI);
    bindRequiredStringEnvVar(Constants.ENV_VAR_LISTEN_MESSAGES_ON);
    bindRequiredStringEnvVar(Constants.ENV_VAR_PUBLISH_MESSAGES_TO);
    bindRequiredStringEnvVar(Constants.ENV_VAR_DATA_ROUTING_KEY);
    bindRequiredStringEnvVar(Constants.ENV_VAR_ERROR_ROUTING_KEY);
    bindRequiredStringEnvVar(Constants.ENV_VAR_REBOUND_ROUTING_KEY);
    bindRequiredStringEnvVar(Constants.ENV_VAR_SNAPSHOT_ROUTING_KEY);
    bindOptionalIntegerEnvVar(Constants.ENV_VAR_REBOUND_LIMIT, Constants.DEFAULT_REBOUND_LIMIT);
    bindOptionalIntegerEnvVar(Constants.ENV_VAR_REBOUND_INITIAL_EXPIRATION, Constants.DEFAULT_REBOUND_INITIAL_EXPIRATION);
}