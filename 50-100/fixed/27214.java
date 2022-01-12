public io.bazel.rules.closure.Webpath resolve(io.bazel.rules.closure.Webpath other) {
    if (other.path.isEmpty()) {
        return this;
    }else
        if ((isEmpty()) || (other.isAbsolute())) {
            return other;
        }else
            if (hasTrailingSeparator()) {
                return new io.bazel.rules.closure.Webpath(((path) + (other.path)));
            }else {
                return new io.bazel.rules.closure.Webpath((((path) + (io.bazel.rules.closure.Webpath.SEPARATOR)) + (other.path)));
            }
        
    
}