private double cmpWeight(util.his_algorithm.splay_tree.SplayNode v, pipeline.post.Hit e_i, pipeline.post.Hit[] sequence, pipeline.post.HitRun_Rater scorer, pipeline.post.mode_one.Alignment_Generator_inParallel.Frame_Direction dir, java.io.RandomAccessFile rafSAM, java.io.RandomAccessFile rafDAA, java.lang.String readID) {
    java.util.Vector<pipeline.post.Hit> hic = new java.util.Vector<pipeline.post.Hit>();
    extractHitRun(v, hic, sequence);
    hic.add(e_i);
    return ((int) (scorer.run(hic, dir, rafSAM, rafDAA, readID)[2]));
}