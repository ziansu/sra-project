@java.lang.Override
public com.kepler.mock.impl.DefaultMockerContext install(java.lang.Object instance) {
    com.kepler.mock.Mocker mocker = com.kepler.mock.Mocker.class.cast(instance);
    this.mockers.put(mocker.support(), mocker);
    return this;
}