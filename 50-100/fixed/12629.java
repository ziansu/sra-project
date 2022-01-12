@com.oracle.truffle.api.dsl.Specialization
public java.lang.Object getIndex(org.jruby.truffle.runtime.core.RubyMatchData matchData, int index) {
    notDesignedForCompilation();
    if ((index >= (matchData.getValues().length)) || (index < 0)) {
        return getContext().getCoreLibrary().getNilObject();
    }else {
        return matchData.getValues()[index];
    }
}