@org.jruby.anno.JRubyMethod(meta = true, name = "wrap", required = 1, optional = 1)
public static org.jruby.runtime.builtin.IRubyObject wrap19(org.jruby.runtime.ThreadContext context, org.jruby.runtime.builtin.IRubyObject recv, org.jruby.runtime.builtin.IRubyObject[] args, org.jruby.runtime.Block block) {
    org.jruby.Ruby runtime = recv.getRuntime();
    org.jruby.ext.zlib.RubyGzipFile instance;
    if (recv == (runtime.getModule("Zlib").getClass("GzipWriter"))) {
        instance = org.jruby.ext.zlib.JZlibRubyGzipWriter.newInstance(recv, args);
    }else {
        instance = org.jruby.ext.zlib.JZlibRubyGzipReader.newInstance(recv, args);
    }
    return org.jruby.ext.zlib.RubyGzipFile.wrapBlock(context, instance, block);
}