@java.lang.Override
public boolean insertVote(edu.brown.benchmark.voteresper.tuples.Vote v) {
    boolean success = executeQuery((((("insert into votes_tbl (" + (edu.brown.benchmark.voteresper.tuples.Vote.outputColumns())) + " ) values (") + (v.outputValues())) + ")"));
    if (success)
        (allVotesEver)++;
    
    return success;
}