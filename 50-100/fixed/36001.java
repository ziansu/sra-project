@java.lang.Override
public void execute(final java.lang.Runnable command) {
    if (command instanceof ru.kmorozov.gbd.core.logic.extractors.base.IUniqueRunnable)
        synchronized(this) {
            T uniqueObj = ((T) (((ru.kmorozov.gbd.core.logic.extractors.base.IUniqueRunnable) (command)).getUniqueObject()));
            synchronized(uniqueObj) {
                if ((uniqueMap.put(uniqueObj, ((ru.kmorozov.gbd.core.logic.extractors.base.IUniqueRunnable<T>) (command)))) == null)
                    super.execute(command);
                
            }
        }
    else
        super.execute(command);
    
}