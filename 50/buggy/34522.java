@lombok.Synchronized
public cc.koosha.konfigurations.core.impl.InMemoryKonfiguration get() {
    this.fin = true;
    return this.inMem;
}