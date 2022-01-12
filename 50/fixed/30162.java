@java.lang.Override
public org.jruby.truffle.runtime.core.RubyModule apply(org.jruby.truffle.runtime.core.RubyModule module) {
    if (module.getClassVariables().containsKey(name)) {
        module.setClassVariable(currentNode, name, value);
        return module;
    }else {
        return null;
    }
}