@java.lang.Override
public void snap(sw.shared.net.Packer p, java.lang.String name) {
    super.snap(p, name);
    p.writeBoolean(_isExploding);
}