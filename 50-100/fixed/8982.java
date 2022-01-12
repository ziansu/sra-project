protected void headerPrivateCPrototypes(org.thingml.xtext.thingML.Thing thing, java.lang.StringBuilder builder, org.thingml.compilers.cpp.CppCompilerContext ctx) {
    java.lang.StringBuilder cppHeaderBuilder = ctx.getCppHeaderCode();
    for (org.thingml.xtext.thingML.Function f : org.thingml.xtext.constraints.ThingMLHelpers.allFunctions(thing)) {
        generatePrototypeforThingDirect(f, cppHeaderBuilder, ctx, thing, true);
        cppHeaderBuilder.append(";\n");
    }
}