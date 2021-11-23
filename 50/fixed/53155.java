@org.jruby.anno.JRubyMethod(name = "private_instance_methods", optional = 1)
public org.jruby.RubyArray private_instance_methods19(org.jruby.runtime.builtin.IRubyObject[] args) {
    return instance_methods(args, org.jruby.PRIVATE, false);
}