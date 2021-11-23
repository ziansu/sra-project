public void exportObject(com.oracle.truffle.api.object.DynamicObject name, com.oracle.truffle.api.interop.TruffleObject object) {
    assert org.jruby.truffle.language.RubyGuards.isRubyString(name);
    exported.put(name.toString(), object);
}