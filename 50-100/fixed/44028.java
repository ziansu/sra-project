private boolean validCand(main.Poly cand) {
    main.PolyAnalyzer analyzer = main.PolyAnalyzer.of(cand);
    if ((!(opt.allowUnconnected)) && (!(analyzer.isConnected()))) {
        return false;
    }
    if ((!(opt.allowHole)) && (!(analyzer.hasNoHole()))) {
        return false;
    }
    return true;
}