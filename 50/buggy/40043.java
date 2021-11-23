public net.instant.util.argparse.OptionValue<Y> merge(net.instant.util.argparse.OptionValue<Y> old) {
    old.getValue().addAll(net.instant.util.argparse.ListOptionValue.getValue());
    return old;
}