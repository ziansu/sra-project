@php.runtime.annotation.Runtime.FastMethod
@php.runtime.ext.core.classes.lib.Signature(value = { @php.runtime.ext.core.classes.lib.Arg(value = "collection", type = php.runtime.common.HintType.TRAVERSABLE) })
public static php.runtime.Memory keys(php.runtime.env.Environment env, php.runtime.Memory... args) {
    php.runtime.lang.ForeachIterator iterator = args[0].getNewIterator(env);
    if (iterator == null) {
        return php.runtime.Memory.NULL;
    }
    php.runtime.memory.ArrayMemory r = new php.runtime.memory.ArrayMemory();
    while (iterator.next())
        r.add(iterator.getMemoryKey());
    
    return r.toConstant();
}