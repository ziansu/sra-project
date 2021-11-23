public me.construqt.ciscian.chatter.steps.generic.Step[] then() {
    return new me.construqt.ciscian.chatter.steps.generic.Step[]{ new me.construqt.ciscian.chatter.steps.flavoured.EnterInput("") , new me.construqt.ciscian.chatter.steps.flavoured.Enable() , new me.construqt.ciscian.chatter.steps.flavoured.PasswordPrompt() , new me.construqt.ciscian.chatter.steps.flavoured.EnterInput(password) };
}