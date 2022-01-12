private boolean validCand(main.Poly cand) {
    if (!(cand.trim().equals(cand))) {
        return false;
    }
    main.PolyAnalyzer analyzer = main.PolyAnalyzer.of(cand);
    if ((!(opt.allowUnconnected)) && (!(analyzer.isConnected()))) {
        return false;
    }
    if ((!(opt.allowHole)) && (!(analyzer.hasNoHole()))) {
        return false;
    }
    return true;
}