@java.lang.Override
public me.sleepyprojects.modelgen.MethodDefinition build() {
    return new me.sleepyprojects.modelgen.MethodDefinition(name, modifiers, arguments.build(), returnType);
}