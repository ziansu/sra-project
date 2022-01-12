@java.lang.Override
public long onProvidePower(long units) {
    if (this._forgeHandler.isProviderConnected())
        return this._forgeHandler.onProvidePower(units);
    
    if (this._rfHandler.isProviderConnected())
        return this._rfHandler.onProvidePower(units);
    
    return units;
}