boolean checkAuthTicketFile(@org.jetbrains.annotations.NotNull
net.groboclown.idea.p4ic.config.part.ConfigPart part, @org.jetbrains.annotations.Nullable
java.io.File file) {
    if ((file != null) && ((!(file.exists())) || (!(file.isFile())))) {
        problems.add(new net.groboclown.idea.p4ic.config.ConfigProblem(part, "configuration.problem.authticket.exist", file));
        return false;
    }
    return true;
}