private java.util.List<com.jetbrains.jetpad.vclang.term.Concrete.Argument> visitLamTeles(java.util.List<com.jetbrains.jetpad.vclang.parser.TeleContext> tele) {
    java.util.List<com.jetbrains.jetpad.vclang.term.Concrete.Argument> arguments = new java.util.ArrayList<>();
    for (com.jetbrains.jetpad.vclang.parser.TeleContext arg : tele) {
        java.util.List<com.jetbrains.jetpad.vclang.term.Concrete.Argument> arguments1 = visitLamTele(arg);
        if (arguments1 == null)
            return null;
        
        arguments.addAll(arguments1);
    }
    return arguments;
}