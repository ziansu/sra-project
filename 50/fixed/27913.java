@java.lang.Override
public org.springframework.statemachine.config.configurers.StateConfigurer<S, E> initial(S initial) {
    this.initialState = initial;
    state(initial);
    return this;
}