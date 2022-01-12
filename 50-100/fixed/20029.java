public static jade.core.behaviours.Behaviour getBehaviourType(int type) {
    switch (type) {
        case behaviour.BehaviourSelector.ALTRUIST :
            return new behaviour.AltruistBehaviour();
        case behaviour.BehaviourSelector.SELECTIVE :
            return new behaviour.SelectiveBehaviour();
        case behaviour.BehaviourSelector.HIPSTER :
            return new behaviour.HipsterBehaviour();
        case behaviour.BehaviourSelector.PHANTOM :
            return new behaviour.PhantomBehaviour();
        case behaviour.BehaviourSelector.CONNECTOR :
            return new behaviour.ConnectorBehaviour();
        default :
            throw new java.lang.IllegalArgumentException(("Invalid behaviour type " + type));
    }
}