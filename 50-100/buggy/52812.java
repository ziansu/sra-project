@org.jruby.anno.JRubyMethod(name = "open", required = 1, optional = 3, meta = true)
public static org.jruby.runtime.builtin.IRubyObject open19(org.jruby.runtime.ThreadContext context, org.jruby.runtime.builtin.IRubyObject recv, org.jruby.runtime.builtin.IRubyObject[] args, org.jruby.runtime.Block block) {
    org.jruby.Ruby runtime = recv.getRuntime();
    args[0] = org.jruby.runtime.Helpers.invoke(context, runtime.getFile(), "open", args[0], runtime.newString("wb"));
    org.jruby.ext.zlib.JZlibRubyGzipWriter gzio = org.jruby.ext.zlib.JZlibRubyGzipWriter.newInstance(recv, args, block);
    return org.jruby.ext.zlib.RubyGzipFile.wrapBlock(context, gzio, block);
}