private com.jetbrains.jetpad.vclang.module.caching.serialization.Variable readBindingRef(int index, boolean isLevel) throws com.jetbrains.jetpad.vclang.module.caching.serialization.DeserializationError {
    if (index == 0) {
        return null;
    }else {
        com.jetbrains.jetpad.vclang.module.caching.serialization.Variable binding = (isLevel) ? myLvlBindings.get((index - 1)) : myBindings.get((index - 1));
        if (binding == null) {
            throw new com.jetbrains.jetpad.vclang.module.caching.serialization.DeserializationError("Trying to read a reference to an unregistered binding");
        }
        return binding;
    }
}